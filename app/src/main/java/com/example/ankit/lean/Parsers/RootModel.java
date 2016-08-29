import java.util.ArrayList;

class RootModel {

	public String description;
	public String privacy;
	public String timezone;
	public String type;
	public String start_time;
	public String organizer_name;
	public int id;
	public String background_image;
	public String location_name;
	public String topic;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String logo;
	public String end_time;
	public String email;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String name;

	public RootModel(String description, String privacy, String timezone, String type, String start_time, String organizer_name, int id, String background_image, String location_name, String topic, String code_of_conduct, CopyrightModel copyright, CreatorModel creator, String logo, String end_time, String email, String schedule_published_on, ArrayList<Social_linksModel> social_links, String state, String organizer_description, VersionModel version, Call_for_papersModel call_for_papers, String name) {

		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this.background_image = background_image;
		this.location_name = location_name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._creator = creator;
		this.logo = logo;
		this.end_time = end_time;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.state = state;
		this.organizer_description = organizer_description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.name = name;

	}

}