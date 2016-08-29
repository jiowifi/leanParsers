import java.util.ArrayList;

class RootModel {

	public String description;
	public String email;
	public CopyrightModel _copyright;
	public String topic;
	public String logo;
	public int id;
	public String privacy;
	public String type;
	public String end_time;
	public String start_time;
	public String location_name;
	public String timezone;
	public String code_of_conduct;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String organizer_description;
	public String organizer_name;
	public String schedule_published_on;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String state;

	public RootModel(String description, String email, CopyrightModel copyright, String topic, String logo, int id, String privacy, String type, String end_time, String start_time, String location_name, String timezone, String code_of_conduct, String background_image, Call_for_papersModel call_for_papers, String name, String organizer_description, String organizer_name, String schedule_published_on, VersionModel version, ArrayList<Social_linksModel> social_links, CreatorModel creator, String state) {

		this.description = description;
		this.email = email;
		this._copyright = copyright;
		this.topic = topic;
		this.logo = logo;
		this.id = id;
		this.privacy = privacy;
		this.type = type;
		this.end_time = end_time;
		this.start_time = start_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.social_links = social_links;
		this._creator = creator;
		this.state = state;

	}

}