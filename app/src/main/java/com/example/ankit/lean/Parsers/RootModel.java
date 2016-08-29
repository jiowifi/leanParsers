import java.util.ArrayList;

class RootModel {

	public String topic;
	public String code_of_conduct;
	public String privacy;
	public String organizer_description;
	public String logo;
	public String timezone;
	public VersionModel _version;
	public String organizer_name;
	public String type;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String start_time;
	public int id;
	public String background_image;
	public String schedule_published_on;
	public String state;
	public CreatorModel _creator;
	public String email;
	public String end_time;
	public String name;

	public RootModel(String topic, String code_of_conduct, String privacy, String organizer_description, String logo, String timezone, VersionModel version, String organizer_name, String type, CopyrightModel copyright, Call_for_papersModel call_for_papers, String description, ArrayList<Social_linksModel> social_links, String location_name, String start_time, int id, String background_image, String schedule_published_on, String state, CreatorModel creator, String email, String end_time, String name) {

		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.timezone = timezone;
		this._version = version;
		this.organizer_name = organizer_name;
		this.type = type;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.social_links = social_links;
		this.location_name = location_name;
		this.start_time = start_time;
		this.id = id;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._creator = creator;
		this.email = email;
		this.end_time = end_time;
		this.name = name;

	}

}