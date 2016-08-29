import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String start_time;
	public String name;
	public String organizer_description;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String privacy;
	public String background_image;
	public String code_of_conduct;
	public String end_time;
	public String organizer_name;
	public String logo;
	public int id;
	public String type;
	public CopyrightModel _copyright;
	public String timezone;
	public String description;
	public VersionModel _version;
	public String location_name;

	public RootModel(String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, CreatorModel creator, String start_time, String name, String organizer_description, String email, Call_for_papersModel call_for_papers, String state, String privacy, String background_image, String code_of_conduct, String end_time, String organizer_name, String logo, int id, String type, CopyrightModel copyright, String timezone, String description, VersionModel version, String location_name) {

		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this._creator = creator;
		this.start_time = start_time;
		this.name = name;
		this.organizer_description = organizer_description;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.privacy = privacy;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.id = id;
		this.type = type;
		this._copyright = copyright;
		this.timezone = timezone;
		this.description = description;
		this._version = version;
		this.location_name = location_name;

	}

}