import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String logo;
	public String organizer_description;
	public String description;
	public String start_time;
	public String end_time;
	public CreatorModel _creator;
	public String name;
	public String privacy;
	public String timezone;
	public String schedule_published_on;
	public String topic;
	public String type;
	public String email;
	public String location_name;
	public VersionModel _version;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;

	public RootModel(String organizer_name, int id, ArrayList<Social_linksModel> social_links, String background_image, String logo, String organizer_description, String description, String start_time, String end_time, CreatorModel creator, String name, String privacy, String timezone, String schedule_published_on, String topic, String type, String email, String location_name, VersionModel version, String code_of_conduct, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state) {

		this.organizer_name = organizer_name;
		this.id = id;
		this.social_links = social_links;
		this.background_image = background_image;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this.end_time = end_time;
		this._creator = creator;
		this.name = name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.type = type;
		this.email = email;
		this.location_name = location_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;

	}

}