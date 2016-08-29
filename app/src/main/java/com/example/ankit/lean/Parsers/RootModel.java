import java.util.ArrayList;

class RootModel {

	public String state;
	public String code_of_conduct;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String timezone;
	public String end_time;
	public String description;
	public String location_name;
	public String organizer_description;
	public String privacy;
	public String logo;
	public CreatorModel _creator;
	public VersionModel _version;
	public int id;
	public String type;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String topic;

	public RootModel(String state, String code_of_conduct, String start_time, ArrayList<Social_linksModel> social_links, String organizer_name, String timezone, String end_time, String description, String location_name, String organizer_description, String privacy, String logo, CreatorModel creator, VersionModel version, int id, String type, String email, String schedule_published_on, CopyrightModel copyright, Call_for_papersModel call_for_papers, String name, String background_image, String topic) {

		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.logo = logo;
		this._creator = creator;
		this._version = version;
		this.id = id;
		this.type = type;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.topic = topic;

	}

}