import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String timezone;
	public String description;
	public CreatorModel _creator;
	public String state;
	public String email;
	public String background_image;
	public String end_time;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String start_time;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_name;
	public String name;
	public CopyrightModel _copyright;
	public String privacy;
	public String schedule_published_on;
	public VersionModel _version;
	public String type;
	public String logo;

	public RootModel(String code_of_conduct, String timezone, String description, CreatorModel creator, String state, String email, String background_image, String end_time, String organizer_description, Call_for_papersModel call_for_papers, String topic, String start_time, String location_name, ArrayList<Social_linksModel> social_links, int id, String organizer_name, String name, CopyrightModel copyright, String privacy, String schedule_published_on, VersionModel version, String type, String logo) {

		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.description = description;
		this._creator = creator;
		this.state = state;
		this.email = email;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.start_time = start_time;
		this.location_name = location_name;
		this.social_links = social_links;
		this.id = id;
		this.organizer_name = organizer_name;
		this.name = name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.type = type;
		this.logo = logo;

	}

}