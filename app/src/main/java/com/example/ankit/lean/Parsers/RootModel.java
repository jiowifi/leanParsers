import java.util.ArrayList;

class RootModel {

	public String description;
	public int id;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String email;
	public String code_of_conduct;
	public String background_image;
	public String type;
	public String location_name;
	public String privacy;
	public String schedule_published_on;
	public String end_time;
	public String organizer_description;
	public VersionModel _version;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String name;
	public String topic;
	public CopyrightModel _copyright;
	public String logo;
	public String state;

	public RootModel(String description, int id, CreatorModel creator, ArrayList<Social_linksModel> social_links, String timezone, String email, String code_of_conduct, String background_image, String type, String location_name, String privacy, String schedule_published_on, String end_time, String organizer_description, VersionModel version, String organizer_name, Call_for_papersModel call_for_papers, String start_time, String name, String topic, CopyrightModel copyright, String logo, String state) {

		this.description = description;
		this.id = id;
		this._creator = creator;
		this.social_links = social_links;
		this.timezone = timezone;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.type = type;
		this.location_name = location_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._version = version;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.name = name;
		this.topic = topic;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;

	}

}