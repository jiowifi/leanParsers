import java.util.ArrayList;

class RootModel {

	public String logo;
	public String timezone;
	public String email;
	public CreatorModel _creator;
	public String name;
	public String location_name;
	public int id;
	public String background_image;
	public String state;
	public String description;
	public VersionModel _version;
	public String start_time;
	public String type;
	public String privacy;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;

	public RootModel(String logo, String timezone, String email, CreatorModel creator, String name, String location_name, int id, String background_image, String state, String description, VersionModel version, String start_time, String type, String privacy, String end_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, CopyrightModel copyright, String organizer_description, String organizer_name, Call_for_papersModel call_for_papers, String code_of_conduct) {

		this.logo = logo;
		this.timezone = timezone;
		this.email = email;
		this._creator = creator;
		this.name = name;
		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.state = state;
		this.description = description;
		this._version = version;
		this.start_time = start_time;
		this.type = type;
		this.privacy = privacy;
		this.end_time = end_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;

	}

}