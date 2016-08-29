import java.util.ArrayList;

class RootModel {

	public String email;
	public String background_image;
	public VersionModel _version;
	public String logo;
	public String schedule_published_on;
	public int id;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String privacy;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String start_time;
	public String location_name;
	public String name;
	public CopyrightModel _copyright;
	public String type;
	public String timezone;
	public String description;
	public String organizer_name;
	public CreatorModel _creator;
	public String code_of_conduct;

	public RootModel(String email, String background_image, VersionModel version, String logo, String schedule_published_on, int id, String organizer_description, ArrayList<Social_linksModel> social_links, String topic, String privacy, String end_time, Call_for_papersModel call_for_papers, String state, String start_time, String location_name, String name, CopyrightModel copyright, String type, String timezone, String description, String organizer_name, CreatorModel creator, String code_of_conduct) {

		this.email = email;
		this.background_image = background_image;
		this._version = version;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.topic = topic;
		this.privacy = privacy;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.start_time = start_time;
		this.location_name = location_name;
		this.name = name;
		this._copyright = copyright;
		this.type = type;
		this.timezone = timezone;
		this.description = description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;

	}

}