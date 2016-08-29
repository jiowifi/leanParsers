import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String topic;
	public String schedule_published_on;
	public String description;
	public String state;
	public String name;
	public String logo;
	public String location_name;
	public VersionModel _version;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public int id;
	public String timezone;
	public String start_time;
	public String privacy;
	public String type;
	public String end_time;

	public RootModel(String background_image, CopyrightModel copyright, String organizer_name, String topic, String schedule_published_on, String description, String state, String name, String logo, String location_name, VersionModel version, CreatorModel creator, String code_of_conduct, String email, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String organizer_description, int id, String timezone, String start_time, String privacy, String type, String end_time) {

		this.background_image = background_image;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.state = state;
		this.name = name;
		this.logo = logo;
		this.location_name = location_name;
		this._version = version;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.id = id;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this.type = type;
		this.end_time = end_time;

	}

}