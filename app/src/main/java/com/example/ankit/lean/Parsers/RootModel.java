import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String start_time;
	public String code_of_conduct;
	public String organizer_description;
	public String end_time;
	public String organizer_name;
	public String timezone;
	public CreatorModel _creator;
	public String logo;
	public String state;
	public String description;
	public String privacy;
	public String email;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String schedule_published_on;
	public String topic;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public int id;
	public String type;

	public RootModel(String background_image, String start_time, String code_of_conduct, String organizer_description, String end_time, String organizer_name, String timezone, CreatorModel creator, String logo, String state, String description, String privacy, String email, CopyrightModel copyright, Call_for_papersModel call_for_papers, String name, String schedule_published_on, String topic, String location_name, ArrayList<Social_linksModel> social_links, VersionModel version, int id, String type) {

		this.background_image = background_image;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._creator = creator;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this.privacy = privacy;
		this.email = email;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.location_name = location_name;
		this.social_links = social_links;
		this._version = version;
		this.id = id;
		this.type = type;

	}

}