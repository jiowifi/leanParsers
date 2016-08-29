import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String topic;
	public String start_time;
	public String code_of_conduct;
	public String type;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public int id;
	public String organizer_description;
	public String email;
	public CopyrightModel _copyright;
	public String end_time;
	public String logo;
	public String timezone;
	public String organizer_name;
	public String schedule_published_on;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String privacy;
	public VersionModel _version;
	public String state;

	public RootModel(String background_image, String topic, String start_time, String code_of_conduct, String type, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, int id, String organizer_description, String email, CopyrightModel copyright, String end_time, String logo, String timezone, String organizer_name, String schedule_published_on, String name, ArrayList<Social_linksModel> social_links, String description, String privacy, VersionModel version, String state) {

		this.background_image = background_image;
		this.topic = topic;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.id = id;
		this.organizer_description = organizer_description;
		this.email = email;
		this._copyright = copyright;
		this.end_time = end_time;
		this.logo = logo;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.social_links = social_links;
		this.description = description;
		this.privacy = privacy;
		this._version = version;
		this.state = state;

	}

}