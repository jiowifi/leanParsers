import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public int id;
	public String organizer_description;
	public String end_time;
	public String name;
	public String privacy;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String topic;
	public String schedule_published_on;
	public String logo;
	public CopyrightModel _copyright;
	public String timezone;
	public String background_image;
	public String location_name;
	public CreatorModel _creator;
	public String type;
	public String state;
	public String email;
	public String description;

	public RootModel(Call_for_papersModel call_for_papers, VersionModel version, String start_time, int id, String organizer_description, String end_time, String name, String privacy, String code_of_conduct, ArrayList<Social_linksModel> social_links, String organizer_name, String topic, String schedule_published_on, String logo, CopyrightModel copyright, String timezone, String background_image, String location_name, CreatorModel creator, String type, String state, String email, String description) {

		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.id = id;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.name = name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._copyright = copyright;
		this.timezone = timezone;
		this.background_image = background_image;
		this.location_name = location_name;
		this._creator = creator;
		this.type = type;
		this.state = state;
		this.email = email;
		this.description = description;

	}

}