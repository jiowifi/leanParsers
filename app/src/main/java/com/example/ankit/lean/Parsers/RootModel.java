import java.util.ArrayList;

class RootModel {

	public String logo;
	public String background_image;
	public String description;
	public int id;
	public String start_time;
	public String end_time;
	public VersionModel _version;
	public String topic;
	public String timezone;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_name;
	public String type;
	public String email;
	public String schedule_published_on;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;

	public RootModel(String logo, String background_image, String description, int id, String start_time, String end_time, VersionModel version, String topic, String timezone, String location_name, ArrayList<Social_linksModel> social_links, String privacy, String organizer_name, String type, String email, String schedule_published_on, CreatorModel creator, Call_for_papersModel call_for_papers, String state, String name, CopyrightModel copyright, String code_of_conduct, String organizer_description) {

		this.logo = logo;
		this.background_image = background_image;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.end_time = end_time;
		this._version = version;
		this.topic = topic;
		this.timezone = timezone;
		this.location_name = location_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.type = type;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.name = name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;

	}

}