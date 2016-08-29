import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public VersionModel _version;
	public String background_image;
	public int id;
	public String description;
	public String code_of_conduct;
	public String schedule_published_on;
	public String timezone;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String start_time;
	public String organizer_description;
	public String state;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String privacy;
	public String location_name;
	public String name;
	public String email;
	public String end_time;
	public String type;

	public RootModel(CopyrightModel copyright, VersionModel version, String background_image, int id, String description, String code_of_conduct, String schedule_published_on, String timezone, String organizer_name, Call_for_papersModel call_for_papers, String topic, String start_time, String organizer_description, String state, CreatorModel creator, ArrayList<Social_linksModel> social_links, String logo, String privacy, String location_name, String name, String email, String end_time, String type) {

		this._copyright = copyright;
		this._version = version;
		this.background_image = background_image;
		this.id = id;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this._creator = creator;
		this.social_links = social_links;
		this.logo = logo;
		this.privacy = privacy;
		this.location_name = location_name;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.type = type;

	}

}